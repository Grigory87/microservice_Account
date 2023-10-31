package ru.skillbox.diplom.group35.microservice.account.domain.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.ZonedDateTime;

/**
 * Account
 *
 * @author Denis_Kholmogorov
 */
@Getter
@Setter
@Entity
@NoArgsConstructor
public class Account extends User {
    @Column(name = "phone", columnDefinition = "VARCHAR(255)")
    private String phone;

    @Column(name = "photo", columnDefinition = "VARCHAR(255)")
    private String photo;

    @Column(name = "profile_cover", columnDefinition = "VARCHAR(255)")
    private String profileCover;

    @Column(name = "about", columnDefinition = "TEXT")
    private String about;

    @Column(name = "city", columnDefinition = "VARCHAR(255)")
    private String city;

    @Column(name = "country", columnDefinition = "VARCHAR(255)")
    private String country;

    @Column(name = "status_code", columnDefinition = "VARCHAR(255)")
    private StatusCode statusCode;

    @Column(name = "reg_date")
    private ZonedDateTime regDate;

    @Column(name = "birth_date")
    private ZonedDateTime birthDate;

    @Column(name = "message_permission", columnDefinition = "VARCHAR(255)")
    private String messagePermission;

    @Column(name = "last_online_time")
    private ZonedDateTime lastOnlineTime;

    @Column(name = "is_online")
    private Boolean isOnline;

    @Column(name = "is_blocked")
    private Boolean isBlocked;

    @Column(name = "emoji_status", columnDefinition = "VARCHAR(255)")
    private String emojiStatus;

    @Column(name = "deletion_timestamp")
    private ZonedDateTime deletionTimestamp;

}
