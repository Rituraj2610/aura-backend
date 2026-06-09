package com.bank.aura.document.model;

// Immutable record representing the database catalog entry for an uploaded file
public record DocumentMetadata(String docId, String fileName, String status) {}