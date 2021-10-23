package Enums;

/**
 *
 * @author blsthathsara
 */
public enum Privilege {
    //Main Menu Privileges
    Client_Management("Client Management"),
    Client("Client"),
    Institution_Administration("Institution Administration"),
    System_Administration("System Administration"),
    //Client Management
    Add_Client("Add Cases"),
    Add_Tests("Add Tests"),
    Mark_Tests("Mark Tests"),
    Submit_Returns("Submit Returns"),
    Search_any_Client_by_IDs("Search any Client by IDs"),
    Search_any_Client_by_Details("Search any Client by Details"),
    @Deprecated
    Search_any_client_by_ID_of_Authorised_Areas("Search any client by ID of Authorised Areas"),
    //Institution Administration
    Manage_Institution_Users("Manage Institution Users"),
    @Deprecated
    Manage_Institution_Metadata("Manage Institution Metadata"),
    Manage_Authorised_Areas("Manage Authorised Areas"),
    Manage_Authorised_Institutions("Manage Authorised Institutions"),
    //System Administration
    Manage_Users("Manage Users"),
    Manage_Metadata("Manage Metadata"),
    Manage_Area("Manage Area"),
    Manage_Institutions("Manage Institutions"),
    Manage_Forms("Manage Forms"),
    //Monitoring and Evaluation
    Monitoring_and_evaluation("Monitoring & Evaluation"),
    Monitoring_and_evaluation_reports("Monitoring & Evaluation Reports"),
    View_individual_data("View Individual Data"),
    View_aggragate_date("View Aggregate Data");

    public final String label;

    private Privilege(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
