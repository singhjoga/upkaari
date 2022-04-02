package org.upkaari.api.common.repos;

import java.io.Serializable;
import java.util.List;

public interface ChildEntityRepository<T, ID extends Serializable,PARENT_ID extends Serializable> extends BaseRepository<T, ID>{
	List<T> findAll(PARENT_ID parentId);
}
