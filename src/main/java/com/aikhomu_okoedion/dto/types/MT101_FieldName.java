package com.aikhomu_okoedion.dto.types;

public enum MT101_FieldName {

    REQUESTED_EXECUTION_DATE("Requested Execution Date"),

    AUTHORISATION("Authorisation"),

    TRANSACTION_REFERENCE("Transaction Reference"),

    FX_DEAL_REFERENCE("F/X Deal Reference"),

    INSTRUCTION_CODE("Instruction Code"),

    CURRENCY_TRANSACTION_AMOUNT("Currency/Transaction Amount"),

    INSTRUCTING_PARTY("Instructing Party"),

    ORDERING_CUSTOMER("Ordering Customer"),

    ACCOUNT_SERVICING_INSTITUTION("Account Ordering Institution"),

    INTERMEDIARY("Intermediary"),

    REMITTANCE_INFORMATION("Remittance Information"),

    REGULATORY_REPORTING("Regulatory Reporting"),

    CURRENCY_ORIGINAL_ORDERED_AMOUNT("Currency/Original Ordered Amount"),

    DETAILS_OF_CHARGES("Details of Charges"),

    EXCHANGE_RATE("Exhange Rate"),

    SENDING_INSTITUTION("Sending Institution");

    private String value;

    MT101_FieldName(String s) {
        value = s;
    }

    private String getValue() {
        return value;
    }
}
