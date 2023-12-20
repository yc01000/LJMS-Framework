export default {
    namespaced: true, // 네임스페이스 활성화
    state: {
        validations: {}
    },
    mutations: {
        setValidationError(state, error) {
            state.validations = error;
        }
    }
}