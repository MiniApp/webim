package im.shs.po;

import java.util.List;

/**
 * Interface for WebimsInfoImageDAO.
 * @author MyEclipse Persistence Tools
 */

public interface IWebimsInfoImageDAO {
	/**
	Perform an initial save of a previously unsaved WebimsInfoImage entity. 
	All subsequent persist actions of this entity should use the #update() method.
	This operation must be performed within the a database transaction context for the entity's data to be permanently saved to the persistence store, i.e., database. 
	This method uses the {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist} operation.
	 
	* <pre> 
	*   EntityManagerHelper.beginTransaction();
	*   IWebimsInfoImageDAO.save(entity);
	*   EntityManagerHelper.commit();
	* </pre>
	@param entity WebimsInfoImage entity to persist
	@throws RuntimeException when the operation fails
	*/
	public void save(WebimsInfoImage entity);

	/**
	 Delete a persistent WebimsInfoImage entity.
	  This operation must be performed 
	 within the a database transaction context for the entity's data to be
	 permanently deleted from the persistence store, i.e., database. 
	 This method uses the {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete} operation.
	 	  
	 * <pre>
	 *   EntityManagerHelper.beginTransaction();
	 *   IWebimsInfoImageDAO.delete(entity);
	 *   EntityManagerHelper.commit();
	 *   entity = null;
	 * </pre>
	   @param entity WebimsInfoImage entity to delete
	 @throws RuntimeException when the operation fails
	 */
	public void delete(WebimsInfoImage entity);

	/**
	 Persist a previously saved WebimsInfoImage entity and return it or a copy of it to the sender. 
	 A copy of the WebimsInfoImage entity parameter is returned when the JPA persistence mechanism has not previously been tracking the updated entity. 
	 This operation must be performed within the a database transaction context for the entity's data to be permanently saved to the persistence
	 store, i.e., database. This method uses the {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge} operation.
	 	 
	 * <pre>
	 *   EntityManagerHelper.beginTransaction();
	 *   entity = IWebimsInfoImageDAO.update(entity);
	 *   EntityManagerHelper.commit();
	 * </pre>
	   @param entity WebimsInfoImage entity to update
	 @return WebimsInfoImage the persisted WebimsInfoImage entity instance, may not be the same
	 @throws RuntimeException if the operation fails
	 */
	public WebimsInfoImage update(WebimsInfoImage entity);

	public WebimsInfoImage findById(WebimsInfoImageId id);

	/**
	* Find all WebimsInfoImage entities with a specific property value.  
	
	 @param propertyName the name of the WebimsInfoImage property to query
	 @param value the property value to match
	 	  @param rowStartIdxAndCount Optional int varargs. rowStartIdxAndCount[0] specifies the  the row index in the query result-set to begin collecting the results. rowStartIdxAndCount[1] specifies the the maximum count of results to return.  
	 	  @return List<WebimsInfoImage> found by query
	*/
	public List<WebimsInfoImage> findByProperty(String propertyName,
			Object value, int... rowStartIdxAndCount);

	/**
	 * Find all WebimsInfoImage entities.
	  	  @param rowStartIdxAndCount Optional int varargs. rowStartIdxAndCount[0] specifies the  the row index in the query result-set to begin collecting the results. rowStartIdxAndCount[1] specifies the the maximum count of results to return.  
	  	  @return List<WebimsInfoImage> all WebimsInfoImage entities
	 */
	public List<WebimsInfoImage> findAll(int... rowStartIdxAndCount);
}