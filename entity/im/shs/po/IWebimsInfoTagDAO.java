package im.shs.po;

import java.util.List;

/**
 * Interface for WebimsInfoTagDAO.
 * @author MyEclipse Persistence Tools
 */

public interface IWebimsInfoTagDAO {
	/**
	Perform an initial save of a previously unsaved WebimsInfoTag entity. 
	All subsequent persist actions of this entity should use the #update() method.
	This operation must be performed within the a database transaction context for the entity's data to be permanently saved to the persistence store, i.e., database. 
	This method uses the {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist} operation.
	 
	* <pre> 
	*   EntityManagerHelper.beginTransaction();
	*   IWebimsInfoTagDAO.save(entity);
	*   EntityManagerHelper.commit();
	* </pre>
	@param entity WebimsInfoTag entity to persist
	@throws RuntimeException when the operation fails
	*/
	public void save(WebimsInfoTag entity);

	/**
	 Delete a persistent WebimsInfoTag entity.
	  This operation must be performed 
	 within the a database transaction context for the entity's data to be
	 permanently deleted from the persistence store, i.e., database. 
	 This method uses the {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete} operation.
	 	  
	 * <pre>
	 *   EntityManagerHelper.beginTransaction();
	 *   IWebimsInfoTagDAO.delete(entity);
	 *   EntityManagerHelper.commit();
	 *   entity = null;
	 * </pre>
	   @param entity WebimsInfoTag entity to delete
	 @throws RuntimeException when the operation fails
	 */
	public void delete(WebimsInfoTag entity);

	/**
	 Persist a previously saved WebimsInfoTag entity and return it or a copy of it to the sender. 
	 A copy of the WebimsInfoTag entity parameter is returned when the JPA persistence mechanism has not previously been tracking the updated entity. 
	 This operation must be performed within the a database transaction context for the entity's data to be permanently saved to the persistence
	 store, i.e., database. This method uses the {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge} operation.
	 	 
	 * <pre>
	 *   EntityManagerHelper.beginTransaction();
	 *   entity = IWebimsInfoTagDAO.update(entity);
	 *   EntityManagerHelper.commit();
	 * </pre>
	   @param entity WebimsInfoTag entity to update
	 @return WebimsInfoTag the persisted WebimsInfoTag entity instance, may not be the same
	 @throws RuntimeException if the operation fails
	 */
	public WebimsInfoTag update(WebimsInfoTag entity);

	public WebimsInfoTag findById(WebimsInfoTagId id);

	/**
	* Find all WebimsInfoTag entities with a specific property value.  
	
	 @param propertyName the name of the WebimsInfoTag property to query
	 @param value the property value to match
	 	  @param rowStartIdxAndCount Optional int varargs. rowStartIdxAndCount[0] specifies the  the row index in the query result-set to begin collecting the results. rowStartIdxAndCount[1] specifies the the maximum count of results to return.  
	 	  @return List<WebimsInfoTag> found by query
	*/
	public List<WebimsInfoTag> findByProperty(String propertyName,
			Object value, int... rowStartIdxAndCount);

	/**
	 * Find all WebimsInfoTag entities.
	  	  @param rowStartIdxAndCount Optional int varargs. rowStartIdxAndCount[0] specifies the  the row index in the query result-set to begin collecting the results. rowStartIdxAndCount[1] specifies the the maximum count of results to return.  
	  	  @return List<WebimsInfoTag> all WebimsInfoTag entities
	 */
	public List<WebimsInfoTag> findAll(int... rowStartIdxAndCount);
}