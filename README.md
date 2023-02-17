# mt101-parser

#### A java parser for swift message  format or schema used to send messages to financial institutions on the SWIFT network. 

###### MT 101 SCOPE

This message format is:
1. sent by a financial institution on behalf of a non-financial institution account owner, to an account servicing financial institution or to a forwarding financial institution for further transmission to the account servicing institution.
2. sent by a non-financial institution account owner, or a party authorised by the account owner, to an account servicing financial institution or to a forwarding financial institution for further transmission to the account servicing institution.
It is used to move funds from the ordering customer's account(s) serviced at the receiving financial institution or at the account servicing institution, or from an account(s) owned by the ordering customer which the instructing customer has explicit authority to debit, for example, a subsidiary account.
The MT 101 can be used to order the movement of funds:

    1. between ordering customer accounts, or
    2.  in favour of a third party, either domestically or internationally.
For use of messages in the corporate to bank environment, see the MT message implementation guide for corporate customers available on www.swift.com.


#### USAGE

```
<dependencies>
    <dependency>
        <groupId>com.aikhomu-okoedion</groupId>
        <artifactId>mt101-parser</artifactId>
        <version>1.0-SNAPSHOT</version>
    </dependency>
</dependencies>

```



