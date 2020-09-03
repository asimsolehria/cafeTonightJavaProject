
package MainPackage;

/**
 *
 * @author Abdul Sami
 */


import org.jpedal.PdfDecoder;
import org.jpedal.exception.PdfException;
import org.jpedal.fonts.FontMappings;
import org.jpedal.objects.PrinterOptions;
import org.jpedal.parser.DecoderOptions;
import org.jpedal.utils.PdfBook;

import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.SimpleDoc;
import javax.print.attribute.Attribute;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.JobName;
import javax.print.attribute.standard.PageRanges;
import java.awt.print.PrinterJob;

/**
 * <h2>PrintPdfPages</h2>
 * <br>
 * This class provides a simple Java API to access PDF printing features in JPEDAL via a simple API
 * <br>
 * <h3>Example 1 - Print all pages from a PDF</h3>
 * <pre><code>PrintPdfPages print=new PrintPdfPages("C:/pdfs/mypdf.pdf");
 *      //print.setPassword("password");
 *      if (print.openPDFFile()) {
 *          print.printAllPages("Printer Name");
 *      }
 *
 *      print.closePDFfile(false);</code></pre>
 * <br>
 * <h3>Example 2 - Print a single page from a PDF</h3>
 * <br>
 * <pre><code>PrintPdfPages print=new PrintPdfPages("C:/pdfs/mypdf.pdf");
 *      //print.setPassword("password");
 *      if (print.openPDFFile()) {
 *          int pageNumber = 1;
 *          print.printPage("Printer Name", pageNumber);
 *      }
 *
 *      print.closePDFfile(false);</code></pre>
 * <br>
 * <h3>Example 3 - Access directly from the Jar</h3>
 * PrintPdfPages can run from jar directly using the command and will print pages from a PDF file.<br>
 * <br>
 * <code>java -cp libraries_needed org/jpedal/examples/printing/PrintPdfPages inputValues</code><br>
 * <br>
 * Where inputValues is 2 or 3 values:
 * <ul>
 * <li>First value:    The PDF filename (including the path if needed). If it contains spaces it must be enclosed by double quotes (ie "C:/Path with spaces/").</li>
 * <li>Second value: The name of the printer to be used. If it contains spaces it must be enclosed by double quotes (ie "My Printer").</li>
 * <li>Third value:    The page number you wish to print as an integer. This is optional, if not set all pages are printed.</li>
 * </ul>
 * <br>
 * <br><a href="https://www.idrsolutions.com/how-to-print-pdf-files-in-java/">See our Support Pages for more info on PDF printing.</a>
 * <br>
 * When running on Windows, Win32PrintServiceLookup starts a daemon thread that does not close when all threads have ended.
 * In order to prevent this thread remaining open and keeping the application open either System.exit(0) should be called or
 * the final use of the method closePDFfile(boolean closeAllThreads) should have an input of true.
 */
public class PrintPdfPages {

    /**
     * the decoder object which decodes the pdf and returns a data object
     */
    private PdfDecoder decode_pdf;

    private String password;

    private String fileName;

    private byte[] byteArray;

    private DocPrintJob printJob;

    public static void main(final String[] args) {

        if (args != null && args.length > 1) {

            if (args.length < 3) { //No page number set to print all
                try {
                    final PrintPdfPages print = new PrintPdfPages(args[0]);
                    //print.setPassword("password");
                    if (print.openPDFFile()) {
                        print.printAllPages(args[1]);
                    }

                    print.closePDFfile(DecoderOptions.isRunningOnWindows);
                } catch (final Exception e) {
                    throw new RuntimeException("Exception " + e.getMessage() + " printing all pages from " + args[0]);
                }
            } else { //Only print specified page
                try {
                    final PrintPdfPages print = new PrintPdfPages(args[0]);
                    //print.setPassword("password");
                    if (print.openPDFFile()) {
                        final int pageNumber = Integer.parseInt(args[2]);
                        print.printPage(args[1], pageNumber);
                    }

                    print.closePDFfile(DecoderOptions.isRunningOnWindows);
                } catch (final Exception e) {
                    throw new RuntimeException("Exception " + e.getMessage() + " printing page " + args[2] + " from " + args[0]);
                }
            }

        } else if (args == null) {
            System.out.println("no arguments entered");
        } else {
            System.out.println("wrong arguments entered");

            final StringBuilder arguments = new StringBuilder();
            for (final String arg : args) {
                arguments.append(arg).append('\n');
            }
            System.out.println("you entered:\n" + arguments + "as the arguments");
        }
    }

    /**
     * Sets up an PrintPdfPages instance to open a PDF File
     *
     * @param fileName full path to a single PDF file
     */
    public PrintPdfPages(final String fileName) {
        this.fileName = fileName;

        init();
    }

    /**
     * Sets up an PrintPdfPages instance to open a PDF file contained as a BLOB within a byte[] stream
     *
     * @param byteArray file as a BLOB
     */
    public PrintPdfPages(final byte[] byteArray) {
        this.byteArray = byteArray;

        init();
    }

    /**
     * @param password the USER or OWNER password for the PDF file
     */
    public void setPassword(final String password) {
        this.password = password;
    }

    private void init() {

        FontMappings.setFontReplacements();

        decode_pdf = new PdfDecoder();

    }

    /**
     * routine to open the PDF File so we can access
     *
     * @return true if successful
     * @throws org.jpedal.exception.PdfException PdfException
     */
    boolean openPDFFile() throws PdfException {

        try {
            if (fileName != null) {
                if (password == null) {
                    decode_pdf.openPdfFile(fileName);
                } else {
                    decode_pdf.openPdfFile(fileName, password);
                }
            } else if (byteArray != null) {
                if (password == null) {
                    decode_pdf.openPdfArray(byteArray);
                } else {
                    decode_pdf.openPdfArray(byteArray, password);
                }
            } else {
                return false;
            }
            
            /*
             * check security settings
             */
            if (decode_pdf.isEncrypted() && (!decode_pdf.isPasswordSupplied())) {

                if (!decode_pdf.isExtractionAllowed()) {
                    throw new PdfException("Not permitted to extract from PDF");
                } else if (password == null) {
                    throw new PdfException("Unable to open encrypted PDF file - call setPassword(passsword) ");
                } else {
                    throw new PdfException("Unable to open encrypted PDF file with password " + password);
                }
            }
        } catch (final Exception e) {

            throw new PdfException(e.getMessage());
        }

        return true;
    }

    /**
     * print all the pages from the open PDF file
     *
     * @param printerName is the printers name
     * @throws javax.print.PrintException PrintException <br>
     *                                    <pre>PrintPdfPages printPages=new PrintPdfPages("C:/pdfs/mypdf.pdf");
     *                                    //printPages.setPassword("password");
     *                                    if(printPages.openPDFFile()){
     *                                        printPages.printAllPages("Printer Name");
     *                                    }
     *
     *                                    printPages.closePDFfile(false);</pre>
     */
    void printAllPages(final String printerName) throws PrintException {
        validatePrinter(printerName);

        //Create set of attributes
        final PrintRequestAttributeSet attributes = getPrintRequestAttributeSet(1, decode_pdf.getPageCount());

        //Automatically rotate and center the Pdf pages for best fit.  Default is true.
        decode_pdf.setPrintAutoRotateAndCenter(false);

        //Pdf page scaling options
        decode_pdf.setPrintPageScalingMode(PrinterOptions.PAGE_SCALING_REDUCE_TO_PRINTER_MARGINS);

        final PdfBook pdfBook = new PdfBook(decode_pdf, printJob.getPrintService(), attributes);
        pdfBook.setChooseSourceByPdfPageSize(false);

        final SimpleDoc doc = new SimpleDoc(pdfBook, DocFlavor.SERVICE_FORMATTED.PAGEABLE, null);

        printJob.print(doc, attributes);

        // any errors reported in JPedal
        if (!decode_pdf.getPageFailureMessage().isEmpty()) {
            System.out.println("Errors reported from JPedal=" + decode_pdf.getPageFailureMessage());
        }
    }

    /**
     * print the page specified from the open PDF file
     *
     * @param printerName is the printers name
     * @param page        is the page to print
     * @throws javax.print.PrintException PrintException <br>
     *                                    <pre>PrintPdfPages printPages=new PrintPdfPages("C:/pdfs/mypdf.pdf");
     *                                    //printPages.setPassword("password");
     *                                    if(printPages.openPDFFile()){
     *                                        printPages.printAllPages("Printer Name", 1);
     *                                    }
     *
     *                                    printPages.closePDFfile(false);</pre>
     */
     void printPage(final String printerName, final int page) throws PrintException {
        validatePrinter(printerName);

        //Create set of attributes
        final PrintRequestAttributeSet attributes = getPrintRequestAttributeSet(page, page);

        //Automatically rotate and center the Pdf pages for best fit.  Default is true.
        decode_pdf.setPrintAutoRotateAndCenter(true);

        //Pdf page scaling options
        decode_pdf.setPrintPageScalingMode(PrinterOptions.PAGE_SCALING_REDUCE_TO_PRINTER_MARGINS);

        final PdfBook pdfBook = new PdfBook(decode_pdf, printJob.getPrintService(), attributes);
        pdfBook.setChooseSourceByPdfPageSize(false);

        final SimpleDoc doc = new SimpleDoc(pdfBook, DocFlavor.SERVICE_FORMATTED.PAGEABLE, null);

        printJob.print(doc, attributes);

        // any errors reported in JPedal
        if (!decode_pdf.getPageFailureMessage().isEmpty()) {
            System.out.println("Errors reported from JPedal=" + decode_pdf.getPageFailureMessage());
        }
    }

    /**
     * @return PrintRequestAttributeSet holding the default print settings
     */
    private PrintRequestAttributeSet getPrintRequestAttributeSet(int rangeStart, int rangeEnd) {
        final PrintRequestAttributeSet attributeSet = new HashPrintRequestAttributeSet();

        // Name the print job
        final String[] jobString = decode_pdf.getFileName().split("/");
        final JobName jobName = new JobName(jobString[jobString.length - 1], null);

        if (validateAttribute(jobName, attributeSet)) {
            attributeSet.add(jobName);
        }

        //Cap print to first and last page
        if (rangeStart < 1) {
            rangeStart = 1;
        }

        if (rangeEnd < 1) {
            rangeEnd = 1;
        }

        if (rangeStart > decode_pdf.getPageCount()) {
            rangeStart = decode_pdf.getPageCount();
        }

        if (rangeEnd > decode_pdf.getPageCount()) {
            rangeEnd = decode_pdf.getPageCount();
        }

        //If range start is higher than end, reverse print
        if (rangeStart > rangeEnd) {
            final int temp = rangeStart;
            rangeStart = rangeEnd;
            rangeEnd = temp;
        }

        //Print out a page range
        final PageRanges range = new PageRanges(rangeStart, rangeEnd);
        if (validateAttribute(range, attributeSet)) {
            attributeSet.add(range);
        }

        return attributeSet;
    }


    /**
     * @return true if the attribute is supported on the current PrintService
     */
    private boolean validateAttribute(final Attribute att, final PrintRequestAttributeSet attributeSet) {
        return printJob.getPrintService().isAttributeValueSupported(att, DocFlavor.SERVICE_FORMATTED.PAGEABLE, attributeSet);
    }

    /**
     * Checks that the desired PrintService exists and sets it as the PrintService to use
     *
     * @param newPrinter The name of the PrintService
     * @return true if PrintService is available
     */
    private void validatePrinter(final String newPrinter) {

        boolean matchFound = false;

        final PrintService[] service = PrinterJob.lookupPrintServices(); // list of printers

        final int count = service.length;

        for (int i = 0; i < count; i++) {
            if (service[i].getName().contains(newPrinter)) {
                printJob = service[i].createPrintJob();
                i = count;
                matchFound = true;
            }
        }

        if (!matchFound) {
            final StringBuilder list = new StringBuilder();
            for (final PrintService aService : service) {
                list.append('\"').append(aService.getName()).append("\",");
            }

            System.err.println("Printer " + newPrinter + " not supported. Options=" + list);
        }
    }

    /**
     * Ensure PDF file is closed once no longer needed and all resources released.
     * <br>
     * Please note, Win32PrintServiceLookup used by Java on Windows has a daemon
     * thread that doesn't close.
     * In order to close this thread a System.exit(0) is required to close the
     * application otherwise the thread prevents it from closing.
     *
     * @param closeAllThreads Flag to call System.exit(0) when finished
     */
    void closePDFfile(final boolean closeAllThreads) {
        
        /*ensure file is closed*/
        if (decode_pdf != null && decode_pdf.isOpen()) {

            decode_pdf.flushObjectValues(true);

            decode_pdf.closePdfFile();
        }

        if (closeAllThreads) {
            System.exit(0);
        }
    }
} 