package org.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DatabaseQueryService {
    public static List<FindMaxProjectsClient> findMaxProjectsClients(String query) throws SQLException {
        List<FindMaxProjectsClient> maxProjectsClients = new ArrayList<>();
        try (Connection conn = Database.getInstance().getConnection();
             Statement stat = conn.createStatement()) {
            ResultSet resultSet = stat.executeQuery(query);
            while (resultSet.next()) {
                String name = resultSet.getString("NAME");
                int projectCount = resultSet.getInt("PROJECT_COUNT");
                maxProjectsClients.add(new FindMaxProjectsClient(name, projectCount));
            }
        }

        return maxProjectsClients;
    }

    public static List<FindLongestProject> findLongestProjects(String query) throws SQLException {
        List<FindLongestProject> longestProjects = new ArrayList<>();
        try (Connection conn = Database.getInstance().getConnection();
             Statement stat = conn.createStatement()) {
            ResultSet resultSet = stat.executeQuery(query);
            while (resultSet.next()) {
                String name = resultSet.getString("NAME");
                int monthCount = resultSet.getInt("MONTH_COUNT");
                longestProjects.add(new FindLongestProject(name, monthCount));
            }

        }

        return longestProjects;
    }

    public static List<FindMaxSalaryWorker> findMaxSalaryWorkers(String query) throws SQLException {
        List<FindMaxSalaryWorker> maxSalaryWorkers = new ArrayList<>();
        try (Connection conn = Database.getInstance().getConnection();
             Statement stat = conn.createStatement()) {
            ResultSet resultSet = stat.executeQuery(query);
            while (resultSet.next()) {
                String name = resultSet.getString("NAME");
                int salary = resultSet.getInt("SALARY");
                maxSalaryWorkers.add(new FindMaxSalaryWorker(name, salary));
            }
        }

        return maxSalaryWorkers;
    }

    public static List<FindYoungestEldestWorkers> findYoungestEldestWorkers (String query) throws SQLException {
        List<FindYoungestEldestWorkers> youngestEldestWorkers = new ArrayList<>();
        try (Connection conn = Database.getInstance().getConnection();
             Statement stat = conn.createStatement()) {
            ResultSet resultSet = stat.executeQuery(query);
            while (resultSet.next()) {
                String type = resultSet.getString("TYPE");
                String name = resultSet.getString("NAME");
                String birthday = resultSet.getString("BIRTHDAY");

                youngestEldestWorkers.add(new FindYoungestEldestWorkers(type, name, birthday));
            }
        }

        return youngestEldestWorkers;
    }

}
