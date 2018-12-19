

package com.codiecon.codiecon.models.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
public class VehicleAvailableDates {

  private static final String VEHICLE_DETAILS = "vehicle_details";
  private static final String ID = "id";

  @GeneratedValue(generator = "uuid")
  @GenericGenerator(name = "uuid", strategy = "uuid")
  @Id
  private String id;

  @ManyToOne
  @JoinColumn(name = VEHICLE_DETAILS, referencedColumnName = ID, nullable = false)
  private VehicleDetails vehicleDetails;

  @DateTimeFormat(pattern="dd.MM.yyyy")
  private Date date;

}