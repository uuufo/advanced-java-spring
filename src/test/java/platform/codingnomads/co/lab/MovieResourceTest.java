package platform.codingnomads.co.lab;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import platform.codingnomads.co.springtest.lab.SpringTestLab;

@SpringBootTest(classes = SpringTestLab.class)
@AutoConfigureMockMvc
public class MovieResourceTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getAllMoviesHTTPRequestShouldReturnListOfStudents() {

    }

    @Test
    public void getAllMoviesShouldReturnStudentListFromService() {

    }
}
