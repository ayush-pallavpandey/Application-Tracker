package com.aistudyplatform.constant;

/**
 * Application-wide Constants
 */
public class Constants {

    // Authentication
    public static final String JWT_SECRET_KEY = "jwt.secret.key";
    public static final String JWT_EXPIRATION = "jwt.expiration";
    public static final long JWT_EXPIRATION_MS = 86400000; // 24 hours
    public static final String AUTHORIZATION_HEADER = "Authorization";
    public static final String BEARER_PREFIX = "Bearer ";

    // API Versioning
    public static final String API_VERSION = "/api/v1";

    // Roles
    public static final String ROLE_ADMIN = "ADMIN";
    public static final String ROLE_USER = "USER";
    public static final String ROLE_MODERATOR = "MODERATOR";

    // Response Messages
    public static final String SUCCESS = "Operation successful";
    public static final String ERROR = "Operation failed";

    // Validation
    public static final int MIN_PASSWORD_LENGTH = 8;
    public static final int MAX_EMAIL_LENGTH = 255;
    public static final int MAX_USERNAME_LENGTH = 50;

    // File Upload
    public static final long MAX_FILE_SIZE = 10 * 1024 * 1024; // 10 MB
    public static final String[] ALLOWED_FILE_TYPES = {"pdf", "docx", "txt", "doc"};

    // Database
    public static final int DEFAULT_PAGE_SIZE = 20;
    public static final int MAX_PAGE_SIZE = 100;

    // Cache Keys
    public static final String CACHE_USER_PREFIX = "user:";
    public static final String CACHE_MATERIAL_PREFIX = "material:";
    public static final String CACHE_QA_PREFIX = "qa:";

    // Error Codes
    public static final String ERROR_CODE_UNAUTHORIZED = "401";
    public static final String ERROR_CODE_FORBIDDEN = "403";
    public static final String ERROR_CODE_NOT_FOUND = "404";
    public static final String ERROR_CODE_CONFLICT = "409";
    public static final String ERROR_CODE_VALIDATION = "422";
    public static final String ERROR_CODE_INTERNAL = "500";

    private Constants() {
        throw new AssertionError("Cannot instantiate utility class");
    }
}
