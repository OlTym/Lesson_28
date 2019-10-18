package com.tym.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.tym.dao.PictureDao;
import com.tym.model.Picture;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.ByteArrayInputStream;
import java.util.List;

@Path("/")
public class PictureApi {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response getAll() {
        Gson gson = new GsonBuilder().
                excludeFieldsWithoutExposeAnnotation().
                setPrettyPrinting().
                create();

        PictureDao dao = new PictureDao();
        List<Picture> pictures = dao.getAll();
        String json = gson.toJson(pictures);
        return Response
                .status(Response.Status.OK)
                .entity(json)
                .build();
    }

    @GET
    @Path("/bird")
    @Produces("image/jpg")
    public Response getBird() {
        final int id = 1;
        ApiService service = new ApiService();
        byte[] image = service.getPicture(id);
        return Response
                .status(Response.Status.OK)
                .entity(new ByteArrayInputStream(image))
                .build();

    }

    @GET
    @Path("/horse")
    @Produces("image/jpg")
    public Response getHorse() {

        final int id = 2;
        ApiService service = new ApiService();
        byte[] image = service.getPicture(id);
        return Response
                .status(Response.Status.OK)
                .entity(new ByteArrayInputStream(image))
                .build();

    }

    @GET
    @Path("/lion")
    @Produces("image/jpg")
    public Response getLion() {
        final int id = 3;
        ApiService service = new ApiService();
        byte[] image = service.getPicture(id);
        return Response
                .status(Response.Status.OK)
                .entity(new ByteArrayInputStream(image))
                .build();
    }

    @GET
    @Path("/fire")
    @Produces("image/jpg")
    public Response getFire() {
        final int id = 4;
        ApiService service = new ApiService();
        byte[] image = service.getPicture(id);
        return Response
                .status(Response.Status.OK)
                .entity(new ByteArrayInputStream(image))
                .build();

    }

    @GET
    @Path("/castl")
    @Produces("image/jpg")
    public Response getCastl() {

        final int id = 5;
        ApiService service = new ApiService();
        byte[] image = service.getPicture(id);

        return Response
                .status(Response.Status.OK)
                .entity(new ByteArrayInputStream(image))
                .build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Path("/add")
    public Response addPicture(@FormParam("strBase64") String strBase64, @FormParam("descr") String descr) {
        PictureDao dao = new PictureDao();

        dao.addPicture(new Picture(strBase64, descr));
        Picture picture = dao.getPictureByBase64(strBase64);

       String str="The picture \""+picture.getDescription()+"\" "+"id - "+picture.getId();
        return Response
                .status(Response.Status.OK)
                .entity(str)
                .build();
    }

}
