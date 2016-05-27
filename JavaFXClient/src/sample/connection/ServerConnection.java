package sample.connection;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import sample.entities.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Damir on 24.05.2016.
 */
public class ServerConnection {
    private final String SERVER_URL = "http://localhost:8080/rest/api/";

    public Position getUserPosition() throws Exception {
        return mapper().readValue(getResponse("position"), Position.class);
    }

    public List<MoviesEntity> getMovies() {
        try {
            return Arrays.asList(mapper().readValue(getResponse("movies"), MoviesEntity[].class));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<MovieSessionsEntity> getMovieSessions() {
        try {
            return Arrays.asList(mapper().readValue(getResponse("moviesessions"), MovieSessionsEntity[].class));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public List<PersonalEntity> getPersonal() {
        try {
            return Arrays.asList(mapper().readValue(getResponse("personal"), PersonalEntity[].class));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<FeedbackEntity> getFeedbacks() {
        try {
            return Arrays.asList(mapper().readValue(getResponse("feedbacks"), FeedbackEntity[].class));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<HallsEntity> getHalls() {
        try {
            return Arrays.asList(mapper().readValue(getResponse("halls"), HallsEntity[].class));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    private ObjectMapper mapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
        return mapper;
    }

    private String getResponse(String path) throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setErrorHandler(new CustomErrorResponseHandler());
        String url = SERVER_URL + path;
        ResponseEntity resp = restTemplate.exchange(url, HttpMethod.GET, request(path), String.class);
        return resp.getBody().toString();
    }



    private HttpEntity request(Object payload) throws IOException {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", ServerAuthentication.getLoginPass());
        return new HttpEntity(payload, headers);
    }




}
