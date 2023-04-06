package org.abhi.worldtime.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TimeResponse {
    private String abbreviation;

    @JsonProperty("client_ip")
    private String clientIp;

    private String datetime;

    @JsonProperty("day_of_week")
    private int dayOfWeek;

    @JsonProperty("day_of_year")
    private int dayOfYear;

    private boolean dst;

    @JsonProperty("dst_from")
    private String dstFrom;

    @JsonProperty("dst_offset")
    private int dstOffset;

    @JsonProperty("dst_until")
    private String dstUntil;

    @JsonProperty("raw_offset")
    private int rawOffset;

    private String timezone;

    private long unixtime;

    @JsonProperty("utc_datetime")
    private String utcDatetime;

    @JsonProperty("utc_offset")
    private String utcOffset;

    @JsonProperty("week_number")
    private int weekNumber;
}
