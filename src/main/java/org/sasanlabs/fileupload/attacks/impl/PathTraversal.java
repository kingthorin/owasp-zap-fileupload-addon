package org.sasanlabs.fileupload.attacks.impl;

/** @author KSASAN preetkaran20@gmail.com */
public class PathTraversal /*implements AttackVector*/ {
    //
    //	private static final String XSS_UPLOADED_FILE_BASE_NAME = "XSSByHtmlUpload_";
    //	private static final String XSS_PAYLOAD_HTML_FILE = "<html><head></head><body>Testing
    // XSS</body></html>";
    //
    //	private static final List<String> HTML_EXTENSIONS = Arrays.asList("htm", "html", "xhtml");
    //	private static final List<String> CONTENT_TYPES =
    // Arrays.asList(Constants.EMPTY_STRING,"text/html", "text/plain");
    //
    //	private static final ContentMatcher CONTENT_MATCHER = new MD5HashResponseMatcher();
    //
    //	@Override
    //	public boolean execute(FileUploadAttackExecutor fileUploadAttackExecutor) throws
    // FileUploadException {
    //		// TODO Auto-generated method stub
    //		return false;
    //	}

    //	private boolean isContentDispositionInline(HttpMessage preflightMsg) {
    //		String headerValue = preflightMsg.getResponseHeader().getHeader("Content-Disposition");
    //		if (headerValue == null || headerValue.trim().equals(Constants.EMPTY_STRING) ||
    // headerValue.equals("inline")) {
    //			return true;
    //		}
    //		return false;
    //	}

    /**
     * Execute the experiment 1. change only content type 2. change only html or htm 3. change html
     * extension and text/plain 4. change htm extension and text/plain or text/html
     */
}
