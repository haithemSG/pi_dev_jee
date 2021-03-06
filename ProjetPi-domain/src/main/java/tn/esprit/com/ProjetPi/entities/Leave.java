package tn.esprit.com.ProjetPi.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;;


/**
 * The persistent class for the Leaves database table.
 * 
 */
@Entity
@Table(name="Leaves")
@NamedQuery(name="Leave.findAll", query="SELECT l FROM Leave l")
public class Leave implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="LeaveId")
	private int leaveId;

	@Column(name="D_date")
	private Date d_date;

	@Column(name="Start_date")
	private Date start_date;

	@Column(name="Type_leave")
	private TypeLeave type_leave;

	//bi-directional many-to-one association to Ressource
	@ManyToOne
	@JoinColumn(name="Ressource_Id")
	private Ressource ressource;

	public Leave() {
	}

	
	public Leave(Date d_date, Date start_date, TypeLeave type_leave, Ressource ressource) {
		super();
		this.d_date = d_date;
		this.start_date = start_date;
		this.type_leave = type_leave;
		this.ressource = ressource;
	}


	public int getLeaveId() {
		return this.leaveId;
	}

	public void setLeaveId(int leaveId) {
		this.leaveId = leaveId;
	}

	public Date getD_date() {
		return this.d_date;
	}

	public void setD_date(Date d_date) {
		this.d_date = d_date;
	}

	public Date getStart_date() {
		return this.start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public TypeLeave getType_leave() {
		return this.type_leave;
	}

	public void setType_leave(TypeLeave type_leave) {
		this.type_leave = type_leave;
	}

	public Ressource getRessource() {
		return this.ressource;
	}

	public void setRessource(Ressource ressource) {
		this.ressource = ressource;
	}

}