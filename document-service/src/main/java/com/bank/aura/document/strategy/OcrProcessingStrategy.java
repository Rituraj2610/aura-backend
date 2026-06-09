package com.bank.aura.document.strategy;

import java.io.File;

// Decouples our core workflow from environment specifics (Local vs AWS Cloud execution)
public interface OcrProcessingStrategy {
    // Contract method to process text extraction asynchronously without freezing the UI
    void processAsync(String docId, File file);
}