package com.bank.aura.document.strategy.local;

import com.bank.aura.document.strategy.OcrProcessingStrategy;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.io.File;

@Component
@Profile("local")
public class LocalThreadOcrStrategy implements OcrProcessingStrategy {

    @Override
    @Async // Instructs Spring to automatically execute this entire method inside an independent background thread
    public void processAsync(String docId, File file) {
        // Log trace stating the local thread processing has initialized
        System.out.println("[LOCAL THREAD] Starting text extraction loop for doc: " + docId);
        try {
            // Simulates the physical processing delay of local OCR extraction
            Thread.sleep(3000);
            // Log trace stating database update simulation has successfully finished
            System.out.println("[LOCAL THREAD] Extraction complete. Database records updated locally.");
        } catch (InterruptedException e) {
            // Properly resets the thread interruption state if aborted
            Thread.currentThread().interrupt();
        }
    }
}
