package im.shs.po;

import java.util.List;

/**
 * Interface for WebimsCommentScoreuserDAO.
 * @author MyEclipse Persistence Tools
 */

public interface IWebimsCommentScoreuserDAO {
	/**
	Perform an initial save of a previously unsaved WebimsCommentScoreuser entity. 
	All subsequent persist actions of this entity should use the #update() method.
	This operation must be performed within the a database transaction context for the entity's data to be permanently saved to the persistence store, i.e., database. 
	This method uses the {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist} operation.
	 
	* <pre> 
	*   EntityManagerHelper.beginTransaction();
	*   IWebimsCommentScoreuserDAO.save(entity);
	*   EntityManagerHelper.commit();
	* </pre>
	@param entity WebimsCommentScoreuser entity to persist
	@throws RuntimeException when the operation fails
	*/
	public void save(WebimsCommentScoreuser entity);

	/**
	 Delete a persistent WebimsCommentScoreuser entity.
	  This operation must be performed 
	 within the a database transaction context for the entity's data to be
	 permanently deleted from the persistence store, i.e., database. 
	 This method uses the {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete} operation.
	 	  
	 * <pre>
	 *   EntityManagerHelper.beginTransaction();
	 *   IWebimsCommentScoreuserDAO.delete(entity);
	 *   EntityManagerHelper.commit();
	 *   entity = null;
	 * </pre>
	   @param entity WebimsCommentScoreuser entity to delete
	 @throws RuntimeException when the operation fails
	 */
	public void delete(WebimsCommentScoreuser entity);

	/**
	 Persist a previously saved WebimsCommentScoreuser entity and return it or a copy of it to the sender. 
	 A copy of the WebimsCommentScoreuser entity parameter is returned when the JPA persistence mechanism has not previously been tracking the updated entity. 
	 This operation must be performed within the a database transaction context for the entity's data to be permanently saved to the persistence
	 store, i.e., database. This method uses the {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge} operation.
	 	 
	 * <pre>
	 *   EntityManagerHelper.beginTransaction();
	 *   entity = IWebimsCommentScoreuserDAO.update(entity);
	 *   EntityManagerHelper.commit();
	 * </pre>
	   @param entity WebimsCommentScoreuser entity to update
	 @return WebimsCommentScoreuser the persisted WebimsCommentScoreuser entity instance, may not be the same
	 @throws RuntimeException if the operation fails
	 */
	public WebimsCommentScoreuser update(WebimsCommentScoreuser entity);

	public WebimsCommentScoreuser findById(WebimsCommentScoreuserId id);

	/**
	* Find all WebimsCommentScoreuser entities with a specific property value.  
	
	 @param propertyName the name of the WebimsCommentScoreuser property to query
	 @param value the property value to match
	 	  @param rowStartIdxAndCount Optional int varargs. rowStartIdxAndCount[0] specifies the  the row index in the query result-set to begin collecting the results. rowStartIdxAndCount[1] specifies the the maximum count of results to return.  
	 	  @return List<WebimsCommentScoreuser> found by query
	*/
	public List<WebimsCommentScoreuser> findByProperty(String propertyName,
			Object value, int... rowStartIdxAndCount);

	/**
	 * Find all WebimsCommentScoreuser entities.
	  	  @param rowStartIdxAndCount Optional int varargs. rowStartIdxAndCount[0] specifies the  the row index in the query result-set to begin collecting the results. rowStartIdxAndCount[1] specifies the the maximum count of results to return.  
	  	  @return List<WebimsCommentScoreuser> all WebimsCommentScoreuser entities
	 */
	public List<WebimsCommentScoreuser> findAll(int... rowStartIdxAndCount);
}