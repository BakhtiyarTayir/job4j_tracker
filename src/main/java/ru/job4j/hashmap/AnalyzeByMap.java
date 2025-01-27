package ru.job4j.hashmap;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        double subjectCount = 0;
        double score = 0;
        for (Pupil pupil : pupils) {
            subjectCount = subjectCount + pupil.subjects().size();
            for (Subject subject : pupil.subjects()) {
                score = score + subject.score();
            }
        }
        return score / subjectCount;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> labelList = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double score = 0;
            for (Subject subject : pupil.subjects()) {
                score = score + subject.score();
            }
            labelList.add(new Label(pupil.name(), score / pupil.subjects().size()));
        }
        return labelList;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        int pupilsCount = pupils.size();
        List<Label> labelList = new ArrayList<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                linkedHashMap.put(
                        subject.name(), subject.score()
                                + linkedHashMap.getOrDefault(subject.name(), 0)
                );
            }
        }
        for (String key : linkedHashMap.keySet()) {
            Label label = new Label(key, (double) linkedHashMap.get(key) / pupilsCount);
            labelList.add(label);
        }
        return labelList;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> labelList = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double score = 0;
            for (Subject subject : pupil.subjects()) {
                score = score + subject.score();
            }
            labelList.add(new Label(pupil.name(), score));
        }
        labelList.sort(Comparator.naturalOrder());
        return labelList.get(labelList.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        int pupilsCount = pupils.size();
        List<Label> labelList = new ArrayList<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                linkedHashMap.put(
                        subject.name(), subject.score()
                        + linkedHashMap.getOrDefault(subject.name(), 0)
                    );
            }
        }
        for (String key : linkedHashMap.keySet()) {
            Label label = new Label(key, linkedHashMap.get(key));
            labelList.add(label);
        }
        labelList.sort(Comparator.naturalOrder());
        return labelList.get(labelList.size() - 1);
    }
}
