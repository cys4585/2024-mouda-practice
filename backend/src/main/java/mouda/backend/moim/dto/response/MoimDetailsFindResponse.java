package mouda.backend.moim.dto.response;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.Builder;
import mouda.backend.moim.domain.Moim;

@Builder
public record MoimDetailsFindResponse(
	String title,
	LocalDate date,
	LocalTime time,
	String place,
	int currentPeople,
	int maxPeople,
	String authorNickname,
	String description
) {
	public static MoimDetailsFindResponse toResponse(Moim moim) {
		return MoimDetailsFindResponse.builder()
			.title(moim.getTitle())
			.date(moim.getDate())
			.time(moim.getTime())
			.place(moim.getPlace())
			.currentPeople(moim.getCurrentPeople())
			.maxPeople(moim.getMaxPeople())
			.authorNickname(moim.getAuthorNickname())
			.description(moim.getDescription())
			.build();
	}
}
