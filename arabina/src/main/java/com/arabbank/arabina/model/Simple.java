package com.arabbank.arabina.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Simple {
    private String id;
    private String titleAR;
    private String titleEN;
    private String titleFR;
    private String descriptionAR;
    private String descriptionEN;
    private String descriptionFR;
    private boolean isPlc;
    private boolean notify;
    private Date date;
    private Date postDate;
    private Date expiryDate;
    private boolean ShowInNewsBar;
    private String newsBarTitleAR;
    private String newsBarTitleEN;
    private String newsBarTitleFR;
    private List<String> country;
}