package im.shs.po;

import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 	* A data access object (DAO) providing persistence and search support for WebimsScoreboard entities.
 	 		* Transaction control of the save(), update() and delete() operations must be handled externally by senders of these methods 
 		  or must be manually added to each of these methods for data to be persisted to the JPA datastore.	
 	 * @see im.shs.po.WebimsScoreboard
  * @author MyEclipse Persistence Tools 
 */

public class WebimsScoreboardDAO implements IWebimsScoreboardDAO {
	// property constants
	public static final String SCOREITEM_ID = "scoreitemId";
	public static final String FTYPE = "ftype";
	public static final String FID = "fid";
	public static final String SCORE = "score";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	Perform an initial save of a previously unsaved WebimsScoreboard entity. 
	All subsequent persist actions of this entity should use the #update() method.
	This operation must be performed within the a database transaction context for the entity's data to be permanently saved to the persistence store, i.e., database. 
	This method uses the {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist} operation.
	 
	* <pre> 
	*   EntityManagerHelper.beginTransaction();
	*   WebimsScoreboardDAO.save(entity);
	*   EntityManagerHelper.commit();
	* </pre>
	@param entity WebimsScoreboard entity to persist
	@throws RuntimeException when the operation fails
	*/
	public void save(WebimsScoreboard entity) {
		EntityManagerHelper.log("saving WebimsScoreboard instance", Level.INFO,
				null);
		try {
			getEntityManager().persist(entity);
			EntityManagerHelper.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 Delete a persistent WebimsScoreboard entity.
	  This operation must be performed 
	 within the a database transaction context for the entity's data to be
	 permanently deleted from the persistence store, i.e., database. 
	 This method uses the {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete} operation.
	 	  
	 * <pre>
	 *   EntityManagerHelper.beginTransaction();
	 *   WebimsScoreboardDAO.delete(entity);
	 *   EntityManagerHelper.commit();
	 *   entity = null;
	 * </pre>
	   @param entity WebimsScoreboard entity to delete
	 @throws RuntimeException when the operation fails
	 */
	public void delete(WebimsScoreboard entity) {
		EntityManagerHelper.log("deleting WebimsScoreboard instance",
				Level.INFO, null);
		try {
			entity = getEntityManager().getReference(WebimsScoreboard.class,
					entity.getScoreboardId());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 Persist a previously saved WebimsScoreboard entity and return it or a copy of it to the sender. 
	 A copy of the WebimsScoreboard entity parameter is returned when the JPA persistence mechanism has not previously been tracking the updated entity. 
	 This operation must be performed within the a database transaction context for the entity's data to be permanently saved to the persistence
	 store, i.e., database. This method uses the {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge} operation.
	 	 
	 * <pre>
	 *   EntityManagerHelper.beginTransaction();
	 *   entity = WebimsScoreboardDAO.update(entity);
	 *   EntityManagerHelper.commit();
	 * </pre>
	   @param entity WebimsScoreboard entity to update
	 @return WebimsScoreboard the persisted WebimsScoreboard entity instance, may not be the same
	 @throws RuntimeException if the operation fails
	 */
	public WebimsScoreboard update(WebimsScoreboard entity) {
		EntityManagerHelper.log("updating WebimsScoreboard instance",
				Level.INFO, null);
		try {
			WebimsScoreboard result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public WebimsScoreboard findById(Integer id) {
		EntityManagerHelper.log("finding WebimsScoreboard instance with id: "
				+ id, Level.INFO, null);
		try {
			WebimsScoreboard instance = getEntityManager().find(
					WebimsScoreboard.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
		 * Find all WebimsScoreboard entities with a specific property value.  
		 
		  @param propertyName the name of the WebimsScoreboard property to query
		  @param value the property value to match
		  	  @param rowStartIdxAndCount Optional int varargs. rowStartIdxAndCount[0] specifies the  the row index in the query result-set to begin collecting the results. rowStartIdxAndCount[1] specifies the the maximum number of results to return.  
		  	  @return List<WebimsScoreboard> found by query
		 */
	@SuppressWarnings("unchecked")
	public List<WebimsScoreboard> findByProperty(String propertyName,
			final Object value, final int... rowStartIdxAndCount) {
		EntityManagerHelper.log(
				"finding WebimsScoreboard instance with property: "
						+ propertyName + ", value: " + value, Level.INFO, null);
		try {
			final String queryString = "select model from WebimsScoreboard model where model."
					+ propertyName + "= :propertyValue";
			Query query = getEntityManager().createQuery(queryString);
			query.setParameter("propertyValue", value);
			if (rowStartIdxAndCount != null && rowStartIdxAndCount.length > 0) {
				int rowStartIdx = Math.max(0, rowStartIdxAndCount[0]);
				if (rowStartIdx > 0) {
					query.setFirstResult(rowStartIdx);
				}

				if (rowStartIdxAndCount.length > 1) {
					int rowCount = Math.max(0, rowStartIdxAndCount[1]);
					if (rowCount > 0) {
						query.setMaxResults(rowCount);
					}
				}
			}
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find by property name failed",
					Level.SEVERE, re);
			throw re;
		}
	}

	public List<WebimsScoreboard> findByScoreitemId(Object scoreitemId,
			int... rowStartIdxAndCount) {
		return findByProperty(SCOREITEM_ID, scoreitemId, rowStartIdxAndCount);
	}

	public List<WebimsScoreboard> findByFtype(Object ftype,
			int... rowStartIdxAndCount) {
		return findByProperty(FTYPE, ftype, rowStartIdxAndCount);
	}

	public List<WebimsScoreboard> findByFid(Object fid,
			int... rowStartIdxAndCount) {
		return findByProperty(FID, fid, rowStartIdxAndCount);
	}

	public List<WebimsScoreboard> findByScore(Object score,
			int... rowStartIdxAndCount) {
		return findByProperty(SCORE, score, rowStartIdxAndCount);
	}

	/**
	 * Find all WebimsScoreboard entities.
	  	  @param rowStartIdxAndCount Optional int varargs. rowStartIdxAndCount[0] specifies the  the row index in the query result-set to begin collecting the results. rowStartIdxAndCount[1] specifies the the maximum count of results to return.  
	  	  @return List<WebimsScoreboard> all WebimsScoreboard entities
	 */
	@SuppressWarnings("unchecked")
	public List<WebimsScoreboard> findAll(final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding all WebimsScoreboard instances",
				Level.INFO, null);
		try {
			final String queryString = "select model from WebimsScoreboard model";
			Query query = getEntityManager().createQuery(queryString);
			if (rowStartIdxAndCount != null && rowStartIdxAndCount.length > 0) {
				int rowStartIdx = Math.max(0, rowStartIdxAndCount[0]);
				if (rowStartIdx > 0) {
					query.setFirstResult(rowStartIdx);
				}

				if (rowStartIdxAndCount.length > 1) {
					int rowCount = Math.max(0, rowStartIdxAndCount[1]);
					if (rowCount > 0) {
						query.setMaxResults(rowCount);
					}
				}
			}
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}

}