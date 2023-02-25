package org.example;

import org.flywaydb.core.Flyway;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException, SQLException {

        String sql = String.join("\n",
                Files.readAllLines(Paths.get("sql/find_max_projects_client.sql")));
        List<FindMaxProjectsClient> maxProjectsClients = DatabaseQueryService.findMaxProjectsClients(sql);
        System.out.println(maxProjectsClients);

        String sql2 = String.join("\n",
                Files.readAllLines(Paths.get("sql/find_longest_project.sql")));
        List<FindLongestProject> longestProjects = DatabaseQueryService.findLongestProjects(sql2);
        System.out.println(longestProjects);

        String sql3 = String.join("\n",
                Files.readAllLines(Paths.get("sql/find_max_salary_worker.sql")));
        List<FindMaxSalaryWorker> maxSalaryWorkers = DatabaseQueryService.findMaxSalaryWorkers(sql3);
        System.out.println(maxSalaryWorkers);

        String sql4 = String.join("\n",
                Files.readAllLines(Paths.get("sql/find_youngest_eldest_workers.sql")));
        List<FindYoungestEldestWorkers> youngestEldestWorkers = DatabaseQueryService.findYoungestEldestWorkers(sql4);
        System.out.println(youngestEldestWorkers);

    }

}
