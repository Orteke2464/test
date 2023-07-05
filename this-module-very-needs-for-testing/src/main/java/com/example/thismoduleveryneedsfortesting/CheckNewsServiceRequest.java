package com.example.thismoduleveryneedsfortesting;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CheckNewsServiceRequest {

  private WayToGetInformation wayToGetInformation;

  private Boolean serviceIsBlocked;

}