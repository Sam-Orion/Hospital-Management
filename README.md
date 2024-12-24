# Hospital Management System

A simple Java-based console application to manage hospital operations, such as managing patients, doctors, and appointments. This project follows a modular structure with separate classes for each entity.

## Features

- **Add and Manage Patients**: Register new patients, view all patients, or search for specific patients.
- **Add and Manage Doctors**: Add doctors with their specialties, view all doctors, or search for specific doctors.
- **Schedule Appointments**: Schedule appointments between patients and doctors, and view all or specific appointments.
- **Modular Design**: Includes separate classes for `Patient`, `Doctor`, and `Appointment`.

## Project Structure

```
src/
  com/
    SamOrion/
      blc/
        Patient.java      // Represents patient information
        Doctor.java       // Represents doctor information
        Appointment.java  // Represents appointment details
      elc/
        HospitalManagement.java  // Main class to manage the application
```

## How to Run

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/Sam-Orion/Hospital-Management.git
   cd Hospital-Management
   ```

2. **Compile the Project**:
   Navigate to the `src` directory and compile the Java files:
   ```bash
   javac com/SamOrion/elc/HospitalManagement.java
   ```

3. **Run the Application**:
   ```bash
   java com.SamOrion.elc.HospitalManagement
   ```

4. **Follow the Console Prompts**:
   Use the menu options to add/view patients, doctors, or appointments.

## Classes

### `HospitalManagement`
The main class that acts as the entry point for the application. It provides the console-based menu system for interacting with patients, doctors, and appointments.

### `Patient`
Represents a patient with the following attributes:
- **ID**: Auto-generated unique ID.
- **Name**: Name of the patient.
- **Gender**: Gender of the patient.
- **Age**: Age of the patient.

### `Doctor`
Represents a doctor with the following attributes:
- **ID**: Auto-generated unique ID.
- **Name**: Name of the doctor.
- **Specialty**: Area of expertise.

### `Appointment`
Represents an appointment with the following attributes:
- **ID**: Auto-generated unique ID.
- **Patient**: The patient for the appointment.
- **Doctor**: The doctor for the appointment.
- **Date**: Date of the appointment.

## Sample Interaction

Upon running the application, the following menu is displayed:
```
Hospital Management System
1. Add Patient
2. Add Doctor
3. Schedule Appointment
4. View Patients
5. View Doctors
6. View Appointments
0. Exit
Enter your choice:
```

### Example Input/Output:
#### Adding a Patient:
```
Enter Patient Name: John Doe
Enter Patient Gender: Male
Enter Patient Age: 30
Patient added successfully.
```

#### Scheduling an Appointment:
```
Enter Patient ID: 1
Enter Doctor ID: 1
Enter Appointment Date (YYYY-MM-DD): 2024-12-25
Appointment scheduled successfully.
```

## Contributing

Contributions are welcome! To contribute:

1. Fork the repository.
2. Create a new branch for your feature or bugfix:
   ```bash
   git checkout -b feature-name
   ```
3. Commit your changes:
   ```bash
   git commit -m "Add feature-name"
   ```
4. Push to your branch:
   ```bash
   git push origin feature-name
   ```
5. Open a pull request.

## License

This project is licensed under the [MIT License](LICENSE).

## Contact

For questions or suggestions, please reach out to shubhammisra936@gmail.com.
