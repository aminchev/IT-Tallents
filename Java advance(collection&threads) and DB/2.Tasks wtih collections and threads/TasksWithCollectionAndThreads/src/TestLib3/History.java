package TestLib3;

import java.time.LocalDateTime;

public class History {
	private LocalDateTime dateTakes;
	private LocalDateTime dateReturn;
	
	public History(LocalDateTime dateTakes) {
		this.dateTakes = dateTakes;
		
	}

	public LocalDateTime getDateReturn() {
		return dateReturn;
	}

	public void setDateReturn(LocalDateTime dateReturn) {
		this.dateReturn = dateReturn;
	}

	public LocalDateTime getDateTakes() {
		return dateTakes;
	}

	public void setDateTakes(LocalDateTime dateTakes) {
		this.dateTakes = dateTakes;
	}
}
