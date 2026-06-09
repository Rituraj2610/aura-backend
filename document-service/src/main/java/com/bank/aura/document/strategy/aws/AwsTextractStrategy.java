package com.bank.aura.document.strategy.aws;

import com.bank.aura.document.strategy.OcrProcessingStrategy;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import java.io.File;

// Registers this class as a manageable bean only when the system profile is set to 'aws'
@Component
@Profile("aws")
public class AwsTextractStrategy implements OcrProcessingStrategy {

    @Override
    public void processAsync(String docId, File file) {
        // Log trace to prove the system changed strategies without breaking code interfaces
        System.out.println("[AWS STRATEGY] Offloading task: Uploading file directly to Amazon S3 Bucket...");
        // Place AWS SDK S3 client code here later; cloud pipeline handles the processing load
    }
}