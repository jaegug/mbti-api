package com.example.mbtiapi.api.user;

import com.example.mbtiapi.dao.entity.TbUser;
import com.example.mbtiapi.dao.repository.TbUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class UserService {

    private final TbUserRepository tbUserRepository;

    @Transactional
    public String getUserMbti(int userId) throws Exception {
        tbUserRepository.save(
                new TbUser(
                        0, 80, 20, 70, 30, 20, 80, 90, 10
                )
        );

        TbUser user = tbUserRepository.findById(userId).orElseThrow(Exception::new);

        StringBuilder mbti = new StringBuilder();

        if (user.getEScore() < user.getIScore()) {
            mbti.append("I");
        } else {
            mbti.append("E");
        }

        if (user.getNScore() < user.getSScore()) {
            mbti.append("S");
        } else {
            mbti.append("N");
        }

        if (user.getTScore() < user.getFScore()) {
            mbti.append("F");
        } else {
            mbti.append("T");
        }

        if (user.getPScore() < user.getJScore()) {
            mbti.append("J");
        } else {
            mbti.append("P");
        }

        return mbti.toString();
    }
}
