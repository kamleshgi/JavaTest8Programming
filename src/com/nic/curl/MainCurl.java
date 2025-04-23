package com.nic.curl;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;

public class MainCurl {
    public static void main(String[] args) {
        try {
            // URL of the API endpoint
            String url = "https://cma.mstcauction.com/mstcapi/rest/elvservice/elvUploadService";

            // Data to be sent in the body of the request
            String data = "{\n" +
            		"   \"COD_number\":\"COD123457\",\n" +
            		"   \"RVSF_Name\":\"Example RVSF\",\n" +
            		"   \"seller_name\":\"Example Seller\",\n" +
            		"   \"registration_no\":\"ABC1234\",\n" +
            		"   \"make\":\"Example Make\",\n" +
            		"   \"model\":\"Example Model\",\n" +
            		"   \"vehicle_category\":\"Example Category\",\n" +
            		"   \"vehicle_type\":\"Example Type\",\n" +
            		"   \"fuel_type\":\"Example Fuel\",\n" +
            		"   \"cubic_capacity\":\"2000cc\",\n" +
            		"   \"seating_capacity\":\"5\",\n" +
            		"   \"year_of_mfg\":\"2020\",\n" +
            		"   \"unladen_weight\":\"1500 kg\",\n" +
            		"   \"number_of_cylinders\":\"4\",\n" +
            		"   \"reg_gross_weight\":\"2000 kg\",\n" +
            		"   \"wheelbase\":\"100 inches\",\n" +
            		"   \"MSTC_auction_no\":\"AUCTION123\",\n" +
            		"   \"MSTC_DO_no\":\"DO123\",\n" +
            		"   \"MSTC_pymt_vcr_no\":\"PAYMENT456\",\n" +
            		"   \"date_of_issuance\":\"2024-02-27\",\n" +
            		"   \"state\":\"Example State\",\n" +
            		"   \"cod_pdf\":\"JVBERi0xLjUKJbXtrvsKNCAwIG9iago8PCAvTGVuZ3RoIDUgMCBSCiAgIC9GaWx0ZXIgL0ZsYXRlRGVjb2RlCj4+}"; 

            // Basic Authentication credentials
            String username = "elvmaster";
            String password = "elv@123777";

            // Encode the credentials
            String encodedCredentials = Base64.getEncoder().encodeToString((username + ":" + password).getBytes());

            // Open connection
            URL apiUrl = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) apiUrl.openConnection();

            // Set request method
            connection.setRequestMethod("POST");

            // Set request headers
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Authorization", "Basic " + encodedCredentials);
            connection.setRequestProperty("clientId", "MSTCECOM_API_2024");
            // Enable output
            connection.setDoOutput(true);

            // Send POST request
            DataOutputStream outputStream = new DataOutputStream(connection.getOutputStream());
            outputStream.writeBytes(data);
            outputStream.flush();
            outputStream.close();

            // Get response code
            int responseCode = connection.getResponseCode();

            // Read response
            BufferedReader reader;
            if (responseCode == HttpURLConnection.HTTP_OK) {
                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            } else {
                reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
            }

            // Print response
            String line;
            StringBuilder response = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            // Print response code and response
            System.out.println("Response Code: " + responseCode);
            System.out.println("Response: " + response.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
