package com.eugene;

import com.eugene.model.entity.Spittle;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by DCLab on 11/19/2015.
 */
public class SpittleTest {
    private List<Spittle> createSpittleList(int count) {
        List<Spittle> spittles = new ArrayList<Spittle>();
        for (int i=0; i < count; i++) {
            spittles.add(new Spittle("Spittle " + i, new Date()));
        }
        return spittles;
    }

//    @Test
//    public void shouldShowRecentSpittles() throws Exception {
//        List<Spittle> expectedSpittles = createSpittleList(20);
//        SpittleRepository mockRepository =
//                mock(SpittleRepository.class);
//        when(mockRepository.findSpittles(Long.MAX_VALUE, 20))
//                .thenReturn(expectedSpittles);
//        SpittleController controller =
//                new SpittleController(mockRepository);
//        SpittleController controller =
//                new SpittleController(mockRepository);
//        MockMvc mockMvc = standaloneSetup(controller)
//                .setSingleView(
//                        new InternalResourceView("/WEB-INF/views/spittles.jsp"))
//                .build();
//        mockMvc.perform(get("/spittles"))
//                .andExpect(view().name("spittles"))
//                .andExpect(model().attributeExists("spittleList"))
//                .andExpect(model().attribute("spittleList",
//                        hasItems(expectedSpittles.toArray())));
//    }
}
