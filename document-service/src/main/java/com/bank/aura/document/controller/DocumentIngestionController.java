package com.bank.aura.document.controller;

import com.bank.aura.document.strategy.OcrProcessingStrategy;
import org.springframework.web.bind.annotation.*;
import java.io.File;

@RestController
@RequestMapping
public class DocumentIngestionController {

    private final OcrProcessingStrategy ocrStrategy;

    public DocumentIngestionController(OcrProcessingStrategy ocrStrategy) {
        this.ocrStrategy = ocrStrategy;
    }

    @PostMapping("/document/upload")
    public String uploadDocument(@RequestParam String docId, @RequestParam String path) {
        ocrStrategy.processAsync(docId, new File(path));
        return "Ingestion sequence initialized under active system strategy context.";
    }
}