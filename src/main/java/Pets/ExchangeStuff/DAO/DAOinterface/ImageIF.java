package Pets.ExchangeStuff.DAO.DAOinterface;

import Pets.ExchangeStuff.model.ImageInfo;

import java.util.List;
import java.util.Set;

/**
 * Created by Student on 2017/6/1.
 */
public interface ImageIF {

    public void insert(ImageInfo imageInfo);

    public void update(ImageInfo imageInfo);

    public void delete(Integer id);

    public ImageInfo findByPrimaryKey(Integer id);

    public List<ImageInfo> getAll();

}
