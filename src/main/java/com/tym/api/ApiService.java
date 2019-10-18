package com.tym.api;

import com.tym.dao.PictureDao;
import com.tym.model.Picture;
import java.util.Base64;

public class ApiService {

    public byte[] getPicture(int id) {

        PictureDao dao = new PictureDao();
        Picture picture = dao.getPictureById(id);
        return Base64.getDecoder().decode(picture.getStrBase64());

    }
}
