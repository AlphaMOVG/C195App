package helperClasses;

import main.JDBC;
import models.Divisions;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DivisionsHelper extends Divisions {

    public DivisionsHelper(int divisionID, String divisionName, int country_ID) {
        super(divisionID, divisionName, country_ID);
    }

    /**
     * ObservableList that takes entire first_level_divisions table.
     *
     * @return firstLevelDivisionsObservableList
     * @throws SQLException
     */
    public static ObservableList<Divisions> getAllDivisions() throws SQLException {
        ObservableList<Divisions> DivisionsObservableList = FXCollections.observableArrayList();
        String sql = "SELECT * from first_level_divisions";
        PreparedStatement ps = JDBC.connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            int divisionID = rs.getInt("Division_ID");
            String divisionName = rs.getString("Division");
            int country_ID = rs.getInt("Country_ID");
            Divisions divisions = new Divisions(divisionID, divisionName, country_ID);
            DivisionsObservableList.add(divisions);
        }
        return DivisionsObservableList;
    }

}
