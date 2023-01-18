package com.vaysai.arxiv.models;

import java.util.List;

public class PaperModel {
    Integer id;
    String published;
    String updated;
    String title;
    String summary;
    ArxivAuthor arxivAuthor;
    String comment;
    String journalRef;
    List<ArxivLink> arxivLinks;
    String primaryCategory;
    List<String> categories;
}
