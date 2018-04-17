package workshop.testing.data.model;

import org.junit.Test;

import java.io.InputStream;

import static org.junit.Assert.*;

/**
 * Created by CAMT on 17/4/2561.
 */
public class RecipeTest {
    @Test
    public void i_can_read_data_from_water(){
        InputStream inputStream = RecipeTest.class.getResourceAsStream("/recipes/water.txt");

        Recipe recipe = Recipe.readFromStream(inputStream);

        assertNotNull(recipe);
        assertEquals("water",recipe.id);
        assertEquals("Water",recipe.title);
        assertEquals("Put glass under tap. Open tap. Close tap. Drink.", recipe.description);



    }

}