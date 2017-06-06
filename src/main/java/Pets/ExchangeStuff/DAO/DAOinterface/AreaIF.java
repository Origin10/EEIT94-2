package Pets.ExchangeStuff.DAO.DAOinterface;

import Pets.ExchangeStuff.model.Area;

import java.util.List;
import java.util.Set;

/**
 * Created by Student on 2017/6/1.
 */
public interface AreaIF {

    public void insert(Area area);

    public void update(Area area);

    public void delete(Integer id);

    public Area findByPrimaryKey(Integer id);

    public List<Area> getAll();
    
}
