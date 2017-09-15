package priv.rdo.sdaspring.task04;

import org.junit.Before;
import org.junit.Test;
import priv.rdo.sdaspring.task02.Animal;

import static org.assertj.core.api.Assertions.assertThat;

public class AnimalServiceJUnitTest {
    private AnimalService animalService;

    @Before
    public void setUp() throws Exception {
        animalService = new AnimalService();
    }

    @Test
    public void shouldFindAzazel() throws Exception {
        //when
        Animal any = animalService.findOne();

        //then
        assertThat(any.getAge()).isEqualTo(666);
        assertThat(any.getName()).isNotEmpty().isEqualTo("Azazel");
    }

}