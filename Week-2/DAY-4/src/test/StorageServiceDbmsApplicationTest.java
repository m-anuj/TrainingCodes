package com.example.storage_service_dbms;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.multipart;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc

public class StorageServiceDbmsApplicationTest{

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private StorageService storageService;

    @Test
    public void testUploadImage() throws Exception {
        // Mock the behavior of storageService.uploadImage
        when(storageService.uploadImage(null)).thenReturn("Image Uploaded Successfully");

        mockMvc.perform(multipart("/image")
                        .file("image", new byte[]{})
                        .contentType(MediaType.MULTIPART_FORM_DATA))
                .andExpect(status().isOk());
    }

    @Test
    public void testDownloadImage() throws Exception {
        // Mock the behavior of storageService.downloadImage
        when(storageService.downloadImage("test.png")).thenReturn(new byte[]{});

        mockMvc.perform(get("/image/test.png")
                        .contentType(MediaType.APPLICATION_OCTET_STREAM))
                .andExpect(status().isOk());
    }
}
