import { computed } from 'vue';
import { useStore } from 'vuex';

export default function useUserinfo() {
  const store = useStore();

  const userinfo = computed(() => store.state.auth.userinfo);

  return {
    userinfo,
  };
}
