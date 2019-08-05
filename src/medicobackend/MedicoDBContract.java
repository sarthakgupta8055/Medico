package medicobackend;

/*
* This interface defines constants containg DB schema values(eg: table names, table schema etc.)
* For pictorial reference into db schema, look here :
* https://github.com/sarthakgupta8055/Medico/tree/master-backend/structure/data
*/


//TODO : DRY RUN ALL QUERIES
public interface MedicoDBContract {
    
    //meta constants
    int TABLE_COUNT = 10;
    
    //TABLE NAMES
    /*
        TABLE NAMING CONVENTION : table_abcd
        The tables are divided into groups, based on the data they contain.
        Each group contains a 'head' table, related to which the data in other tables are matched inside a group
        The 'head' table reserves the first index (i.e. '0') in the naming convention and the other tables in that group simply follow the arithmatic progression. Eg: table_0110
        ab - 01 - This depicts the 2nd 'head' table(index starts at 00).
        cd - 10 - This depicts the 11th table under any head table.
        Therefore,
        table_0110 - 11th related sub-table under the 2nd 'head' table.
        This naming convention limits the no. of tables in a database to:
        max. 100 'head' tables and max. 100 related sub-tables for each 'head' table(a total of 100*100 tables)
        Neverthless it suits the db schema.
    */
    
    //doc - head
    String DOC_TABLE = "table_0000";
    String DEGREE_TABLE = "table_0001";
    String SPECIALIZATION_TABLE = "table_0002";
    String ORGANIZATION_TABLE = "table_0003";
    String DOC_DEGREE_TABLE = "table_0004";
    String DOC_SPECIALIZATION_TABLE = "table_0005";
    String DOC_ADDR_TABLE = "table_0006";
    
    //patient - head
    String PATIENT_TABLE = "table_0100";
    String PRESCRIPTION_TABLE = "table_0101";
    String PATIENT_PRESCRIPTION_TABLE = "table_0102";
    
    /* 
        doc table create query
    */
    String DOC_TABLE_QUERY = "CREATE TABLE " + DOC_TABLE + " (ID INT NOT NULL AUTO_INCREMENT, FNAME VARCHAR(30) NOT NULL, MNAME VARCHAR(30), LNAME VARCHAR(30), PHONE VARCHAR(10) NOT NULL UNIQUE, EMAIL VARCHAR(200) UNIQUE, DOB DATE NOT NULL, PASSWD VARCHAR(50) NOT NULL, LIC_NO VARCHAR(50) NOT NULL UNIQUE, M_TIME TIME, E_TIME TIME, CREATED_AT TIMESTAMP NOT NULL, PRIMARY KEY(ID));"; //tested - ok
    
    String DEGREE_TABLE_QUERY = "CREATE TABLE " + DEGREE_TABLE + " (ID INT NOT NULL AUTO_INCREMENT, NAME VARCHAR(100) NOT NULL, ORGANIZATION INT NOT NULL, PRIMARY KEY(ID));"; //tested - ok
    
    String SPECIALIZATION_TABLE_QUERY = "CREATE TABLE " + SPECIALIZATION_TABLE + " (ID INT NOT NULL AUTO_INCREMENT, NAME VARCHAR(100) NOT NULL, ORGANIZATION INT NOT NULL, PRIMARY KEY(ID));"; //tested - ok
    
    String ORGANIZATION_TABLE_QUERY = "CREATE TABLE " + ORGANIZATION_TABLE + " (ID INT NOT NULL AUTO_INCREMENT, NAME VARCHAR(200) NOT NULL UNIQUE, PRIMARY KEY(ID));"; //tested - ok
    
    String DOC_DEGREE_TABLE_QUERY = "CREATE TABLE " + DOC_DEGREE_TABLE + " (DOCTOR INT NOT NULL, DEGREE INT NOT NULL);"; //tested - ok
    
    String DOC_SPECIALIZATION_TABLE_QUERY = "CREATE TABLE " + DOC_SPECIALIZATION_TABLE + " (DOCTOR INT NOT NULL, SPECIALIZATION INT NOT NULL);"; //tested - ok
    
    String DOC_ADDR_TABLE_QUERY = "CREATE TABLE " + DOC_ADDR_TABLE + " (DOCTOR INT NOT NULL, ADDR VARCHAR(200) NOT NULL, ADDR_TYPE VARCHAR(50));"; //tested - ok
    
    /*
        patient table create query
    */
    String PATIENT_TABLE_QUERY = "CREATE TABLE " + PATIENT_TABLE + " (ID INT NOT NULL AUTO_INCREMENT, NAME VARCHAR(100) NOT NULL, PHONE VARCHAR(10) NOT NULL, DOB DATE NOT NULL, AADHAR VARCHAR(20) NOT NULL UNIQUE, PRIMARY KEY(ID));";//tested - ok
    
    String PRESCRIPTION_TABLE_QUERY = "CREATE TABLE " + PRESCRIPTION_TABLE + " (ID INT NOT NULL AUTO_INCREMENT, DOCTOR INT NOT NULL, PATIENT INT NOT NULL, PATIENT_WT INT, DIAGNOSE VARCHAR(200), PRESCRIPTION VARCHAR(200), EXTRA_DATA VARCHAR(200), REF_TO INT, DATE_CURRENT DATE NOT NULL, DATE_NEXT DATE, PRIMARY KEY(ID));";//tested - ok
    
    String PATIENT_PRESCRIPTION_TABLE_QUERY = "CREATE TABLE " + PATIENT_PRESCRIPTION_TABLE + " (PATIENT INT NOT NULL, PRESCRIPTION INT NOT NULL);"; //tested - ok
}
