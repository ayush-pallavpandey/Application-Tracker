package com.aistudyplatform.constant;

/**
 * Centralized Error Messages
 */
public class ErrorMessages {

    // Authentication Errors
    public static final String INVALID_CREDENTIALS = "Invalid email or password";
    public static final String USER_NOT_FOUND = "User not found";
    public static final String USER_ALREADY_EXISTS = "User already exists";
    public static final String INVALID_TOKEN = "Invalid or expired token";
    public static final String UNAUTHORIZED_ACCESS = "Unauthorized access";

    // Validation Errors
    public static final String INVALID_EMAIL = "Invalid email format";
    public static final String WEAK_PASSWORD = "Password must be at least 8 characters";
    public static final String INVALID_USERNAME = "Username must be 3-50 characters";
    public static final String EMPTY_FIELD = "This field cannot be empty";

    // Resource Errors
    public static final String MATERIAL_NOT_FOUND = "Study material not found";
    public static final String QUESTION_NOT_FOUND = "Question not found";
    public static final String PROGRESS_NOT_FOUND = "Progress record not found";

    // File Upload Errors
    public static final String INVALID_FILE_TYPE = "Invalid file type. Allowed: pdf, docx, txt";
    public static final String FILE_TOO_LARGE = "File size exceeds maximum limit of 10MB";
    public static final String FILE_UPLOAD_FAILED = "File upload failed";

    // RAG/AI Errors
    public static final String EMBEDDING_FAILED = "Failed to generate embeddings";
    public static final String VECTOR_SEARCH_FAILED = "Vector search failed";
    public static final String AI_SERVICE_UNAVAILABLE = "AI service is currently unavailable";

    // Generic Errors
    public static final String INTERNAL_ERROR = "An internal error occurred";
    public static final String RESOURCE_CONFLICT = "Resource conflict";
    public static final String RATE_LIMIT_EXCEEDED = "Rate limit exceeded";

    private ErrorMessages() {
        throw new AssertionError("Cannot instantiate utility class");
    }
}
