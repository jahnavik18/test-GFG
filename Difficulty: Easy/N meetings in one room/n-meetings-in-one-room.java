class Solution {
    public int maxMeetings(int[] start, int[] end) {
        int n = start.length;

        // make pair-list of meeting time
        ArrayList<Pair> meetings = new ArrayList<>();
        for (int i = 0; i < n; i++) meetings.add(new Pair(start[i], end[i]));

        //sort by end time
        meetings.sort(Comparator.comparingInt(p -> p.end));
        //System.out.println(meetings);

        int prevMeetingEnd = -1, meetingCount = 0;
        for (int i = 0; i < n; i++) {
            Pair currMeeting = meetings.get(i);

            // if prev meeting is ended, start new meeting
            if (prevMeetingEnd < currMeeting.start) {
                prevMeetingEnd = currMeeting.end;
                meetingCount++;
            }
        }

        return meetingCount;
    }

    private static class Pair {
        int start, end;

        public Pair(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public String toString() {
            return "(" + start + ", " + end + ')';
        }
    }
}