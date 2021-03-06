package phong.tran1.habibi.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HabitDTO {
    private Integer id;
    private String name;
    private Boolean isArchived;
    private String accentColor;
    private List<GoalDTO> goals;
    private String regularly;
    private String timeOfDay;
    private String habitType;
    private HabitFolderDTO habitFolder;
    private Double priority;
    private String priorityByFolder;
    private Date startDate;
    private Date createdAt;
    private Date updatedAt;
}
