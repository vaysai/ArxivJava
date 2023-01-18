package com.vaysai.arxiv.models;

import lombok.Data;

@Data
public class ArxivModel{
    String title;
    String id;
    String updated;
    String totalResults;
    String startIndex;
    String itemsPerPage;
    PaperModel paperModel;


}