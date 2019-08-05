# medico-dev
 A system for patient medical history

### Setup
##### Currently supports single database setup

1. Clone the repository
2. Set the following enviormental variables:
	- "MEDICO_DB_PATH" : path to mysql db
	- "MEDICO_DB_USER" : mysql user
	- "MEDICO_DB_PASSWD" : mysql password
3. Install Apache Tomcat Web container
4. Configure file structure as a tomcat webapp
5. Start tomcat and launch localhost:8080(default port) on a web browser

##### Headers Raw Data

<img src="https://raw.githubusercontent.com/sarthakgupta8055/Medico/master/structure/data/raw_data.png" alt="Raw_data" width="300px" height="auto"></img>

### Current Database Schema
##### Doctor Data

<img src="https://raw.githubusercontent.com/sarthakgupta8055/Medico/master/structure/data/doc_table.png" alt="Doctor" width="800px" height="auto"></img>

<img src="https://raw.githubusercontent.com/sarthakgupta8055/Medico/master/structure/data/degree_table.png" alt="Degree" width="300px" height="auto" style="display: inline-block;"></img>
<img src="https://raw.githubusercontent.com/sarthakgupta8055/Medico/master/structure/data/specialization_table.png" alt="Specialization" width="300px" height="auto" style="display: inline-block;"></img>

<div></div>

<img src="https://raw.githubusercontent.com/sarthakgupta8055/Medico/master/structure/data/doc_degree_table.png" alt="Doctor Degree" width="400px" height="auto" style="display: inline-block;"></img>
<img src="https://raw.githubusercontent.com/sarthakgupta8055/Medico/master/structure/data/doc_specialization_table.png" alt="Doctor Specialization" width="400px" height="auto" style="display: inline-block;"></img>
<img src="https://raw.githubusercontent.com/sarthakgupta8055/Medico/master/structure/data/doc_addr_table.png" alt="Doctor Address" width="400px" height="auto" style="display: inline-block;"></img>

##### Patient Data

<img src="https://raw.githubusercontent.com/sarthakgupta8055/Medico/master/structure/data/patient_table.png" alt="Patient" width="400px" height="auto"></img>

##### Prescription Data

<img src="https://raw.githubusercontent.com/sarthakgupta8055/Medico/master/structure/data/prescription_table.png" alt="Prescription" width="500px" height="auto"></img>

<img src="https://raw.githubusercontent.com/sarthakgupta8055/Medico/master/structure/data/patient_prescription_table.png" alt="Patient Prescription" width="400px" height="auto" style="display: inline-block;"></img>