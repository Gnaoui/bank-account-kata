**Bank account kata**

_**Description:**_

Think of your personal bank account experience When in doubt, go for the simplest
solution.


**_Requirements_**

Deposit and Withdrawal Account statement (date, amount, balance) Statement printing

**_User Stories_**:

**_US 1:_**

In order to save money
As a bank client
I want to make a deposit in my account

**_US 2:_**

In order to retrieve some or all of my savings
As a bank client
I want to make a withdrawal from my account

**_US 3:_**

In order to check my operations
As a bank client
I want to see the history (operation, date, amount, balance) of my operations

**_Requirement:_**

JDk8+

Junit5

NB: project as maven


**_Example:_**

If you run the actual code you wil have as result the following table

Operation | Date             | Amount | Balance

Deposit | 2021-11-19 00:29 | 220,00 | 1912,00

Withdraw | 2021-11-19 00:29 | -33,00 | 1692,00

Deposit | 2021-11-19 00:29 | 100,00 | 1725,00

Withdraw | 2021-11-19 00:29 | -175,00 | 1625,00

Withdraw | 2021-11-19 00:29 | -200,00 | 1800,00

Deposit | 2021-11-19 00:29 | 2000,00 | 2000,00


**_NB:_** The date are formatted as yyyy-MM-dd HH:mm (see constant class under /java/constants package)