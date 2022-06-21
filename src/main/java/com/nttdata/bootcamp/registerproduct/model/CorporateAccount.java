package com.nttdata.bootcamp.registerproduct.model;

import com.nttdata.bootcamp.registerproduct.service.external.dto.TypeAccount;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@Document(collection = "corporateAccounts")
public class CorporateAccount {
  @Id
  private String id;
  @NotNull
  private String code;
  @NotNull
  private String accountNumber;
  @NotNull
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date openingDate;
  @NotNull
  private String customerId;
  @NotNull
  private String accountId;
  @NotNull
  private Boolean state;
  @NotNull
  private BigDecimal amount;
  @NotEmpty
  private List<Client> holders;
  private List<Client> signers;
}
