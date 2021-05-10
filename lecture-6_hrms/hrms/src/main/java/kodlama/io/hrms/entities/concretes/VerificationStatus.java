package kodlama.io.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="verification_status")
public class VerificationStatus {
	
		@Id
		@GeneratedValue
		@Column(name="id")
		private int id;
		
		@Column(name="user_id")
		private int user_id;
		
		@Column(name="email_verification")
		private boolean email_verification;
		
		@Column(name="system_verification")
		private boolean system_verification;
		
		@Column(name="mernis_verification")
		private boolean mernis_verification;

		public VerificationStatus() {

		}
		public VerificationStatus(int id, int user_id, boolean email_verification, boolean system_verification,
				boolean mernis_verification) {
			super();
			this.id = id;
			this.user_id = user_id;
			this.email_verification = email_verification;
			this.system_verification = system_verification;
			this.mernis_verification = mernis_verification;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getUser_id() {
			return user_id;
		}

		public void setUser_id(int user_id) {
			this.user_id = user_id;
		}

		public boolean isEmail_verification() {
			return email_verification;
		}

		public void setEmail_verification(boolean email_verification) {
			this.email_verification = email_verification;
		}

		public boolean isSystem_verification() {
			return system_verification;
		}

		public void setSystem_verification(boolean system_verification) {
			this.system_verification = system_verification;
		}

		public boolean isMernis_verification() {
			return mernis_verification;
		}

		public void setMernis_verification(boolean mernis_verification) {
			this.mernis_verification = mernis_verification;
		}
		
}
