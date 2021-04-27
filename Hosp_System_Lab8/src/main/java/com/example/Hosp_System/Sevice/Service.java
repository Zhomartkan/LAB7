package com.example.Hosp_System.Sevice;

import com.example.Hosp_System.Connection.DatabaseConnection;
import com.example.Hosp_System.Entity.Admin;
import com.example.Hosp_System.Entity.Diagnosis;
import com.example.Hosp_System.Entity.Doctor;
import com.example.Hosp_System.Entity.Patient;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Service {
    public Admin adminLogin(String email, String password) {
        Admin admin = null;
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            Class.forName(DatabaseConnection.DRIVERCLASS);
            con = DriverManager.getConnection(DatabaseConnection.DBURL, DatabaseConnection.USER, DatabaseConnection.PASSWORD);
            pstmt = con.prepareStatement("select * from admins where email = ? and password = ? ");
            pstmt.setString(1, email);
            pstmt.setString(2, password);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                Admin a = new Admin();
                a.setId(rs.getInt(1));
                a.setName(rs.getString(2));
                a.setEmail(rs.getString(3));
                a.setPassword(rs.getString(4));
                admin = a;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            connectionClose(con, pstmt);
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return admin;
    }
    private void connectionClose(Connection con, PreparedStatement pstmt) {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (pstmt != null) {
            try {
                pstmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public boolean addAmin(Admin admin) {
        Connection con = null;
        PreparedStatement pstmt = null;
        boolean state = false;
        int count = 0;
        try {
            Class.forName(DatabaseConnection.DRIVERCLASS);
            con = DriverManager.getConnection(DatabaseConnection.DBURL, DatabaseConnection.USER, DatabaseConnection.PASSWORD);
            pstmt = con.prepareStatement("insert into admins values (?,?,?,?)");
            pstmt.setInt(1, admin.getId());
            pstmt.setString(2, admin.getName());
            pstmt.setString(3, admin.getEmail());
            pstmt.setString(4, admin.getPassword());

            count = pstmt.executeUpdate();
            if (count >= 0) {
                state = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            connectionClose(con, pstmt);
        }
        return state;
    }

    public Doctor doctorsLogin(String email, String password) {
        Doctor doctor = null;
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            Class.forName(DatabaseConnection.DRIVERCLASS);
            con = DriverManager.getConnection(DatabaseConnection.DBURL, DatabaseConnection.USER, DatabaseConnection.PASSWORD);
            pstmt = con.prepareStatement("select * from doctors where email = ? and password = ? ");
            pstmt.setString(1, email);
            pstmt.setString(2, password);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                Doctor a = new Doctor();
                a.setId(rs.getInt(1));
                a.setName(rs.getString(2));
                a.setEmail(rs.getString(3));
                a.setPassword(rs.getString(4));
                doctor = a;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            connectionClose(con, pstmt);
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return doctor;
    }

    public boolean addDoctors(Doctor doctor) {
        Connection con = null;
        PreparedStatement pstmt = null;
        boolean state = false;
        int count = 0;
        try {
            Class.forName(DatabaseConnection.DRIVERCLASS);
            con = DriverManager.getConnection(DatabaseConnection.DBURL, DatabaseConnection.USER, DatabaseConnection.PASSWORD);
            pstmt = con.prepareStatement("insert into doctors values (?,?,?,?)");
            pstmt.setInt(1, doctor.getId());
            pstmt.setString(2, doctor.getName());
            pstmt.setString(3, doctor.getEmail());
            pstmt.setString(4, doctor.getPassword());

            count = pstmt.executeUpdate();
            if (count >= 0) {
                state = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            connectionClose(con, pstmt);
        }
        return state;
    }

    public Patient patientLogin(String email, String password) {
        Patient patient = null;
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            Class.forName(DatabaseConnection.DRIVERCLASS);
            con = DriverManager.getConnection(DatabaseConnection.DBURL, DatabaseConnection.USER, DatabaseConnection.PASSWORD);
            pstmt = con.prepareStatement("select * from patients where email = ? and password = ? ");
            pstmt.setString(1, email);
            pstmt.setString(2, password);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                Patient a = new Patient();
                a.setId(rs.getInt(1));
                a.setName(rs.getString(2));
                a.setEmail(rs.getString(3));
                a.setPassword(rs.getString(4));
                patient = a;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            connectionClose(con, pstmt);
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return patient;
    }

    public boolean addPatient(Patient patient) {
        Connection con = null;
        PreparedStatement pstmt = null;
        boolean state = false;
        int count = 0;
        try {
            Class.forName(DatabaseConnection.DRIVERCLASS);
            con = DriverManager.getConnection(DatabaseConnection.DBURL, DatabaseConnection.USER, DatabaseConnection.PASSWORD);
            pstmt = con.prepareStatement("insert into patients values (?,?,?,?,?)");
            pstmt.setInt(1, patient.getId());
            pstmt.setString(2, patient.getName());
            pstmt.setString(3, patient.getEmail());
            pstmt.setString(4, patient.getPassword());
            pstmt.setString(5, patient.getDiagnosis());

            count = pstmt.executeUpdate();
            if (count >= 0) {
                state = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            connectionClose(con, pstmt);
        }
        return state;

    }
    public boolean addDiagnosis(Diagnosis diagnosis) {
        Connection con = null;
        PreparedStatement pstmt = null;
        boolean state = false;
        int count = 0;
        try {
            Class.forName(DatabaseConnection.DRIVERCLASS);
            con = DriverManager.getConnection(DatabaseConnection.DBURL, DatabaseConnection.USER, DatabaseConnection.PASSWORD);
            pstmt = con.prepareStatement("insert into diagnosis values (?,?,?)");
            pstmt.setInt(1, diagnosis.getId());
            pstmt.setString(2, diagnosis.getName());
            pstmt.setString(3, diagnosis.getTreatment());

            count = pstmt.executeUpdate();
            if (count >= 0) {
                state = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            connectionClose(con, pstmt);
        }
        return state;
    }

    public List<Diagnosis> listAllDiagnosis() {
        Connection con = null;
        PreparedStatement cal = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        boolean state = false;
        List<Diagnosis> list = new ArrayList<>();
        try {
            Class.forName(DatabaseConnection.DRIVERCLASS);
            con = DriverManager.getConnection(DatabaseConnection.DBURL, DatabaseConnection.USER, DatabaseConnection.PASSWORD);
            cal = con.prepareStatement("SELECT * FROM diagnosis ");
            state = cal.execute();
            if (state) {
                rs = cal.getResultSet();
                while (rs.next()) {
                    Diagnosis u = new Diagnosis();
                    u.setId(rs.getInt(1));
                    u.setName(rs.getString(2));
                    u.setTreatment(rs.getString(3));
                    list.add(u);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            connectionClose(con, pstmt);
        }
        return list;
    }


    public List<Doctor> listAllDoctors() {
        Connection con = null;
        PreparedStatement cal = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        boolean state = false;
        List<Doctor> list = new ArrayList<>();
        try {
            Class.forName(DatabaseConnection.DRIVERCLASS);
            con = DriverManager.getConnection(DatabaseConnection.DBURL, DatabaseConnection.USER, DatabaseConnection.PASSWORD);
            cal = con.prepareStatement("SELECT * FROM doctors ;");
            state = cal.execute();
            if (state) {
                rs = cal.getResultSet();
                while (rs.next()) {
                    Doctor u = new Doctor();
                    u.setId(rs.getInt(1));
                    u.setName(rs.getString(2));

                    u.setEmail(rs.getString(3));
                    u.setPassword(rs.getString(4));

                    list.add(u);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            connectionClose(con, pstmt);
        }
        return list;
    }

    public List<Patient> listAllPatient() {
        Connection con = null;
        PreparedStatement cal = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        boolean state = false;
        List<Patient> list = new ArrayList<>();
        try {
            Class.forName(DatabaseConnection.DRIVERCLASS);
            con = DriverManager.getConnection(DatabaseConnection.DBURL, DatabaseConnection.USER, DatabaseConnection.PASSWORD);
            cal = con.prepareStatement("SELECT * FROM patients ;");
            state = cal.execute();
            if (state) {
                rs = cal.getResultSet();
                while (rs.next()) {
                    Patient u = new Patient();
                    u.setId(rs.getInt(1));
                    u.setName(rs.getString(2));
                    u.setEmail(rs.getString(3));
                    u.setPassword(rs.getString(4));
                    u.setDiagnosis(rs.getString(5));

                    list.add(u);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            connectionClose(con, pstmt);
        }
        return list;
    }
}
